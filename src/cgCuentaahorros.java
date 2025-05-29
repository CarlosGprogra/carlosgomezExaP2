public class cgCuentaahorros extends cgCuenta {
    private boolean activa;

    public cgCuentaahorros(float saldo, float tasaanual, boolean activa) {
        super(saldo, tasaanual);
        this.activa = activa;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de depósitos: " + numerodepositos);
        System.out.println("Número de retiros: " + numeroretiros);
        System.out.println("Tasa anual: " + tasaanual);
        System.out.println("Cuenta activa: " + (activa ? "Sí" : "No"));
    }
}
