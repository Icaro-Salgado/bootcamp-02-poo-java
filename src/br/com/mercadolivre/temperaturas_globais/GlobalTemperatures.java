package br.com.mercadolivre.temperaturas_globais;

public class GlobalTemperatures {
    private String[] cities;
    private int[] minTemperatures, maxTemperatures;

    public GlobalTemperatures() {
        populate();
    }

    private void populate() {
        cities = new String[]{
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio",
        };

        minTemperatures = new int[]{
                -2, -3, -8, 4, 6, 5, 0, -7, -1, -10,
        };

        maxTemperatures = new int[]{
                33, 32, 27, 37, 42, 43, 39, 26, 31, 35
        };
    }

    public int getMaxTemperaturePosition(){
        int maxTemperature = Integer.MIN_VALUE, maxTemperaturePosition=0;

        for (int pos=0; pos < maxTemperatures.length;  pos++) {

            if (maxTemperatures[pos] > maxTemperature) {
                maxTemperaturePosition = pos;
                maxTemperature = maxTemperatures[pos];
            }
        }

        return maxTemperaturePosition;
    }

    public int getMinTemperaturePosition(){
        int minTemperature = Integer.MAX_VALUE, minTemperaturePosition=0;

        for (int pos=0; pos < minTemperatures.length;  pos++) {

            if (minTemperatures[pos] < minTemperature) {
                minTemperaturePosition = pos;
                minTemperature = minTemperatures[pos];
            }
        }

        return minTemperaturePosition;
    }

    public void printMinMaxTemperaturesInfo(){
        int minTemperaturePosition = getMinTemperaturePosition();
        int maxTemperaturePosition = getMaxTemperaturePosition();

        int minTemperature = minTemperatures[minTemperaturePosition];
        String cityMinTemperature = cities[minTemperaturePosition];

        int maxTemperature = maxTemperatures[maxTemperaturePosition];
        String cityMaxTemperature = cities[maxTemperaturePosition];

        String minTemperatureInfo = "A temperatura mais baixa foi em " + cityMinTemperature + ", com " + minTemperature + "º C";
        String maxTemperatureInfo = "A temperatura mais alta foi em " + cityMaxTemperature + ", com " + maxTemperature + "º C";

        System.out.println(minTemperatureInfo);
        System.out.println(maxTemperatureInfo);

    }

    public static void main(String[] args) {
        GlobalTemperatures globalTemperatures = new GlobalTemperatures();

        globalTemperatures.printMinMaxTemperaturesInfo();
    }
}
