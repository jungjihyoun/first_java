public class UnitConverter {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM = 1 / KILOGRAMS_PER_POUND;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCHES_PER_CENTIMETE = 1 / CENTIMETERS_PER_INCH;

    private  UnitConverter(){
        //인스턴스 생성불가
    }
    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요°F = °C × (9 / 5) + 32
        return POUNDS_PER_KILOGRAM * kilograms;

    }
    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요°C = (°F − 32) x (5 / 9)
        return KILOGRAMS_PER_POUND * pounds ;
    }
    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
        return CENTIMETERS_PER_INCH * inches;
    }
    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
        return INCHES_PER_CENTIMETE * centimeters;
    }
    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요 F = °C × (9 / 5) + 32
        return celsius * ((double)9/5) + 32;
    }
    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요 C = (°F − 32) x (5 / 9)
        return (fahrenheit - 32) * ((double)5/9);
    }
}