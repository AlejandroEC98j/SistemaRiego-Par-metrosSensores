package GUI;

import javax.swing.JOptionPane;

public class Sensores {
    public String U1;
    public String U2;
    public String U3;
    public String Nombre;
    public int ValorActual;
    public int maxH1;
    public int minH1;
    public int maxT1;
    public int minT1;
    public int maxH2;
    public int minH2;
    public int maxT2;
    public int minT2;
    public int max;
    public int min;
    
    public void RegistrarParametros(String sensor,int max, int min){
        if("Sens. Humedad 1".equals(sensor)){
            maxH1=max;
            minH1=min;
        }
        if("Sens. Temperatura 1".equals(sensor)){
            maxT1=max;
            minT1=min;
        }
        if("Sens. Humedad 2".equals(sensor)){
            maxH2=max;
            minH2=min;
        }
        if("Sens. Temperatura 2".equals(sensor)){
            maxT1=max;
            minT1=min;
        }
        JOptionPane.showMessageDialog(null, "Se registró parametros para "+sensor);
    }
    public void SelecionarSensor(String sensor){
        if("Sens. Humedad 1".equals(sensor)){
            U1=" %";
            U2=" %";
            U3=" %";
            Nombre=sensor;
            ValorActual=50;
            max=maxH1;
            min=minH1;
        }
        if("Sens. Temperatura 1".equals(sensor)){
            U1="ºC";
            U2="ºC";
            U3="ºC";
            Nombre=sensor;
            ValorActual=16;
            max=maxT1;
            min=minT1;
        }
        if("Sens. Humedad 2".equals(sensor)){
            U1=" %";
            U2=" %";
            U3=" %";
            Nombre=sensor;
            ValorActual=49;
            max=maxH2;
            min=minH2;
        }
        if("Sens. Temperatura 2".equals(sensor)){
            U1="ºC";
            U2="ºC";
            U3="ºC";
            Nombre=sensor;
            ValorActual=15;
            max=maxT2;
            min=minT2;
        }
    }
    
}
