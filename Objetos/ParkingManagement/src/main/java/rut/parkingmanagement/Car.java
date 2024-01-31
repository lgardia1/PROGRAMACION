package rut.parkingmanagement;

enum Country {
    SPAIN, ITALY, FRANCE, GERMANY, UE, NOTUE, OTHER
}
enum CarType{
    HYBRID, ELECTRIC, COMBUSTION, OTHER
}

public class Car {

    // No pongo si es de minusválidos porque eso es la plaza, no el coche
    private String plate;
    private Country country;
    private float width;
    private float length;
    private CarType type;

    public Car(String plate, String country, float width, float length, String type) {
        setPlate(plate);
        setCountry(country);
        this.width = width;
        this.length = length;
        setType(type);
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        // Comprobar que la matrícula tiene un formato correcto mediante PATRONES
        this.plate = plate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(String country) {
        try {
            Country carCountry = Country.valueOf(country.toUpperCase());
            this.country = carCountry;
        } catch (IllegalArgumentException e) {
            System.out.println("Pais desconocido");
            this.country = Country.OTHER;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error inesperado en el pais del coche");
            this.country = Country.OTHER;
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        // Hay que controlar que tenga una anchura mayor de 0 hasta un máximo
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        // Hay que controlar que tenga una anchura mayor de 0 hasta un máximo
        this.length = length;
    }

    public CarType getType() {
        return type;
    }

    public void setType(String type) {
        this.type = CarType.valueOf(type.toUpperCase());
    }

    public static Car checkCoche(String plate, String country, float width, float length, String type) throws Exception{
        boolean checkPlate = checkPlate(plate);
        boolean checkWidth = checkWidth(width);
        boolean checkLength = checkLength(length);
        boolean checkType = checkType(type);
        if(checkPlate && checkWidth && checkLength && checkType){
            return new Car(plate, country, width, length,type);
        }
        System.out.println("No se ha podido meter el coche");
        return null;
    }

    public static boolean checkPlate(String plate) throws IndexOutOfBoundsException , Exception{
        try {
            String[] id = plate.strip().split("-");
            if (id.length == 2) {
                if (isNumeric(id[0]) && checkCharacter(id, true) && id[0].length() == 4 && id[1].length() == 2) return true;
            }
            throw new Exception();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error en la matricula/Array id, fuera del indice");
            return false;
        } catch (Exception e) {
            System.out.println("Error en la matricula");
            return false;
        }
    }

    public static boolean isNumeric(String numeric) throws NumberFormatException , Exception{
        try {
            Integer.parseInt(numeric);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Formato no valido en el numero de la matricula");
            return false;
        }
    }

    public static boolean checkCharacter(String[] character, boolean isEuropean) throws IllegalArgumentException , Exception{
        try {
            if (isEuropean) {
                for (char c : character[1].toCharArray()) {
                    if (!Character.isLetter(c)) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Formato no valido en los caracteres de la matricula");
            return false;
        }catch(Exception e){
            System.out.println("Error en la matricula");
            return false;
        }
    }

    public static boolean checkWidth(float width) throws WidthOutOfBounds , Exception{
        try {
            if (1.7 > width || width > 2.2) {
                throw new WidthOutOfBounds("");
            }
            return true;
        } catch (WidthOutOfBounds e) {
            System.out.println("Anchura fuera de los limites");
            return false;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado en el ancho del coche.");
            return false;
        }
    }

    public static boolean checkLength(float length) throws LengthOutOfBounds , Exception{
        try {
            if (3.5 > length || length > 6.5) {
                throw new LengthOutOfBounds("");
            }
            return true;
        } catch (LengthOutOfBounds e) {
            System.out.println("Largo fuera de los limites");
            return false;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado en el largo del coche.");
            return false;
        }
    }

    public static boolean checkType(String type) throws IllegalArgumentException , Exception{
        try {
            CarType carType = CarType.valueOf(type.strip().toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de coche no valido.");
            return false;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado en el tipo de coche.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" + "plate=" + getPlate() + ", country=" + getCountry()
                + ",\n width=" + width + ", length=" + length + ", type="
                + getType() + '}';
    }

}
