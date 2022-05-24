import java.io.*;
import java.util.*;

public class VUELIXAR implements Serializable {

    HashMap<String, Vuelo> vueloHashMap;

    public VUELIXAR() {
        vueloHashMap = new HashMap<>();
    }

    public boolean addVuelo(Vuelo vuelo) {
        if (!vueloHashMap.containsKey(vuelo.getCodigo())) {
            vueloHashMap.put(vuelo.getCodigo(), vuelo);
            return true;
        }
        return false;
    }

    public boolean addPasajero(String codigo, Pasajero pasajero) {
        if (vueloHashMap.containsKey(codigo)) {
            Iterator<Vuelo> it = vueloHashMap.values().iterator();

            while (it.hasNext()) {
                Vuelo v = it.next();

                if (v.getCodigo().equals(codigo)) {
                    v.getPasajeros().add(pasajero);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean removePasajero(String codigo, Pasajero pasajero) {
        if (vueloHashMap.containsKey(codigo)) {
            Iterator<Vuelo> it = vueloHashMap.values().iterator();

            while (it.hasNext()) {
                Vuelo v = it.next();

                if (v.getCodigo().equals(codigo)) {
                    v.getPasajeros().remove(pasajero);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void mostrarXPasajeros() {
        System.out.println(vueloHashMap);
    }

    public void cargarDatos() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("sae.dat"));

            while (true) {
                Vuelo vuelo = (Vuelo) ois.readObject();

                if (!vueloHashMap.containsKey(vuelo.getCodigo())) {
                    vueloHashMap.put(vuelo.getCodigo(), vuelo);
                }

                vueloHashMap.get(vuelo.getCodigo());
            }
        } catch (Exception e) {

        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {

                }
            }
        }
    }

    public void guardarDatos() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("sae.dat"));

            Collection<Vuelo> vuelos = vueloHashMap.values();

            for (Vuelo ignored : vuelos) {
                for (Vuelo v : vuelos) {
                    oos.writeObject(v);
                }
            }

        } catch (IOException e) {

        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {

                }
            }
        }
    }

    public HashMap<String, Vuelo> getVueloHashMap() {
        return vueloHashMap;
    }

    public void setVueloHashMap(HashMap<String, Vuelo> vueloHashMap) {
        this.vueloHashMap = vueloHashMap;
    }

    @Override
    public String toString() {
        return "VUELIXAR{" +
                "vueloHashMap=" + vueloHashMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VUELIXAR vuelixar = (VUELIXAR) o;
        return Objects.equals(vueloHashMap, vuelixar.vueloHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vueloHashMap);
    }
}
