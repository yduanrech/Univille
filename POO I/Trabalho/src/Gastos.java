import java.util.ArrayList;
import java.util.List;

public class Gastos {
    //atributos
    private int tipoGasto;
    private int diaGasto;
    private int mesGasto;
    private int anoGasto;
    private double valorGasto;
    private int tipoPagamento;
    private static double totalGastos;

    //contructor
    public Gastos(int tipoGasto, int diaGasto, int mesGasto, int anoGasto, double valorGasto, int tipoPagamento){
        this.tipoGasto = tipoGasto;
        this.valorGasto = valorGasto;
        this.tipoPagamento = tipoPagamento;
    }

    //get e set
    public int getTipoGasto() {
        return tipoGasto;
    }
    public void setTipoGasto(int tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public int getDiaGasto() {
        return diaGasto;
    }
    public void setDiaGasto(int diaGasto) {
        this.diaGasto = diaGasto;
    }

    public int getMesGasto() {
        return mesGasto;
    }
    public void setMesGasto(int mesGasto) {
        this.mesGasto = mesGasto;
    }

    public int getAnoGasto() {
        return anoGasto;
    }
    public void setAnoGasto(int anoGasto) {
        this.anoGasto = anoGasto;
    }

    public double getValorGasto(){
        return valorGasto;
    }
    public void setValorGasto(double valorGasto){
        this.valorGasto = valorGasto;
    }
    public int getTipoPagamento(){
        return tipoPagamento;
    }
    public void setTipoPagamento(int tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }

    //metodos
    public static void adicionarGasto(double valorGasto) {
        totalGastos += valorGasto;
    }
    public static double getTotalGastos() {
        return totalGastos;
    }


}
