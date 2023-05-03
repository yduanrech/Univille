import java.util.ArrayList;

public class GestaoFinanceira {
    private double totalGastoMes;
    private double totalGanhoMes;

    //get e set
    public double getTotalGastoMes(){
        return totalGastoMes;
    }
    public void setTotalGastoMes(double totalGastoMes){
        this.totalGanhoMes = totalGastoMes;
    }
    public double getTotalGanhoMes(){
        return totalGanhoMes;
    }
    public void setTotalGanhoMes(double totalGanhoMes){
        this.totalGanhoMes = totalGanhoMes;
    }

    public GestaoFinanceira(double totalGastoMes, double totalGanhoMes) {
        this.totalGastoMes = totalGastoMes;
        this.totalGanhoMes = totalGanhoMes;
    }

    //metodos


    public static void relatorioGastos(ArrayList<String> listaTipoGasto, ArrayList<Integer> listaDia, ArrayList<Integer> listaMes, ArrayList<Integer> listaAno, ArrayList<Double> listaGasto, ArrayList<String> listaTipoPagamento){
        for (int i = 0; i < listaTipoGasto.size(); i++){
            System.out.println(listaTipoGasto.get(i) + "  " + listaDia.get(i) + "-" + listaMes.get(i) + "-" + listaAno.get(i) + " " + listaGasto.get(i) + "  " + listaTipoPagamento.get(i) + "  ");
        }
    }

    public static void relatorioGanhos(ArrayList<String> listaTipoGanho,
                                       ArrayList<Integer> listaDiaGanho,
                                       ArrayList<Integer> listaMesGanho,
                                       ArrayList<Integer> listaAnoGanho,
                                       ArrayList<Double> listaValorGanho){
        for (int i = 0; i < listaTipoGanho.size(); i++){
            System.out.println(listaTipoGanho.get(i) + "  " + listaDiaGanho.get(i) + "-" + listaMesGanho.get(i) + "-" + listaAnoGanho.get(i) + " " + listaValorGanho.get(i));
        }
    }

    public static void relatorioMensal(double totalGastos, double totalGanhos) {
        double saldoMensal = totalGanhos - totalGastos;

        System.out.println("Total de gastos do mês: " + totalGastos);
        System.out.println("Total de ganhos do mês: " + totalGanhos);
        System.out.println("Saldo mensal: " + saldoMensal);
    }


}