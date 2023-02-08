package calculadoras;

public class Calculadoras {
    public float num1;
    public float num2;
    public float resultado;
    public float angulo;
  
    public float suma(float a, float b)
    {
    return a+b;
    }
   
public float resta(float a, float b)
{
return a-b;
}
public float multi(float a, float b)
{
return a*b;
}
public float div(float a, float b)
{
return a/b;
}
public double coseno(double c)
{
    double o = Math.toRadians(c);
    return Math.cos(o);
}
public double seno(double s)
{
    double o = Math.toRadians(s);
    return Math.sin(o);
}
public double tangente(double t)
{
    double o = Math.toRadians(t);
    return Math.tan(o);
}
public float iva(float i, float v){
        return v*(i/100);
    }

public double raiz(double n, double m){
        return Math.pow(n,1/m);
    }
public double potencia(double n, double m){
        return Math.pow(n, m);
    }
  


public Calculadoras()
{
num1=0;
num2=0;
resultado=0;
angulo=0;
}
public Calculadoras(float a,float b, float c,float d)
{
num1=a;
num2=b;
resultado=c;
angulo=d;
}
public float getnum1()
{
return num1;
}
public void setnum1(float a)
{
num1=a;
}

public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}