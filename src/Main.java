
public class Main {
    public static void main(String[] args) {
        //задача 3
        System.out.println(calculateDeliveryDays(88));
        //задача 1
        int year = 2001;
        checkLeapAndPrint(year);
        //задача 2
        int deviceYear = 2000;
        int clientOs = 1;
        System.out.println (getRecommendApplicationVersion (deviceYear, clientOs));
        String recommendApplicationVersion = getRecommendApplicationVersion (2010, 1));
        if (recommendApplicationVersion != null) {
            System.out.println (recommendApplicationVersion);
        }else
            System.out.println ("не валидные данные");
    }
    private static void getRecommendApplicationVersion(int deviceYear, int clientOs) {
        if (clientOs < 0 || clientOs > 1) {
            return null;
        }
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < 1990 && deviceYear > currentYear + 1) {
            return null;
        }
        String resultMessage = "Установите";
        if (isOldDevice(deviceYear)) {
            resultMessage += "Lite ";
        }
        resultMessage += "версию для";
        if (clientOs == 1) {
            resultMessage += "Android";
        } else {
            resultMessage += "IOS";
        }
        return resultMessage;
    }
    private static boolean isOldDevice(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;
    }
    //задача 3
    public static int calculateDeliveryDays (int deliveryDistance) {
        int result = -1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            result = 1;
        }else if (deliveryDistance <= 60) {
            result = 2;
        }else if (deliveryDistance <= 100) {
            result = 3;
        }
        return result;
        //задача 1
        private static void checkLeapAndPrint(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.printf("%d год - высокосный год", year);
            } else {
                System.out.printf("%d год - невысокосный год", year);
            }



