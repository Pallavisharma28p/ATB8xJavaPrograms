package Sept.ex23092024;

public class Converter {
    public static void main(String[] args) {
        double value=96.8;
        String Choice="m";
        switch (Choice) {
            case "Km":
            {
                System.out.println(value + " km is equals to :" + (value*1000) +" m");
                break;
            }
            case "m":
            {
                System.out.println(value + " m is equals to :" + (value/1000) +" Km");
                break;
            }
            case "f":
            {
                System.out.println(value + " F is equals to :" + ((value-32) * 5/9) +" °C");
                break;
            }
            case "c":
            {
                System.out.println(value + "°C is equals to :" + ((value*9/5) + 32) +"F" );
                break;
            }
        }
    }
    }

