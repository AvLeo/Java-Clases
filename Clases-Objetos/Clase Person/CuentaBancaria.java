public class CuentaBancaria {
    int saldo;
    String tipoMoneda;
    int limiteExtraccion;


    public void Extraccion(int monto){
        if(monto < saldo){
            if(monto > min && monto < max){
                saldo -= monto;
                System.out.println("Retiraste " + monto + " y te queda:" + saldo);
            }
        }
    }
}
