public class Ganhos {
    private int tipoGanho;
    private int diaGanho;
    private int mesGanho;
    private int anoGanho;
    private double valorGanho;
    private static double totalGanho;

    public Ganhos(int tipoGanho, int diaGanho, int mesGanho, int anoGanho, double valorGanho) {
        this.tipoGanho = tipoGanho;
        this.diaGanho = diaGanho;
        this.mesGanho = mesGanho;
        this.anoGanho = anoGanho;
        this.valorGanho = valorGanho;
    }

    //get e set
    public int getTipoGanho(){
        return tipoGanho;
    }
    public void setTipoGanho(int tipoGanho){
        this.tipoGanho = tipoGanho;
    }

    public int getDiaGanho() {
        return diaGanho;
    }
    public void setDiaGanho(int diaGanho) {
        this.diaGanho = diaGanho;
    }

    public int getMesGanho() {
        return mesGanho;
    }
    public void setMesGanho(int mesGanho) {
        this.mesGanho = mesGanho;
    }

    public int getAnoGanho() {
        return anoGanho;
    }
    public void setAnoGanho(int anoGanho) {
        this.anoGanho = anoGanho;
    }

    public double getValorGanho(){
        return valorGanho;
    }
    public void setValorGanho(double valorGanho){
        this.valorGanho = valorGanho;
    }

    //metodos
    public static void adicionarGanho(double valorGanho) {
        totalGanho += valorGanho;
    }
    public static double getTotalGanho() {
        return totalGanho;
    }
}
