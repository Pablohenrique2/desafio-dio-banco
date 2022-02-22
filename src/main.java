public class main {
    public static void main(String[] args) {
        conta cc = new contaCorrente();
        cc.depositar(100);
        conta poupança = new contaPoupanca();
cc.transferir(100,poupança);
      poupança.imprimirInformacoesComuns();
    cc.imprimirInformacoesComuns();
    }
}
