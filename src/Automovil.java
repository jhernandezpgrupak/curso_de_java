public class Automovil implements  Comparable<Automovil>{
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indRuedas ;
    private TipoAutomovil tipo;
    private static int capacidadTanqueStatico = 80;
    private static int uId;

    public static final int VELOCIDAD_MEXIMA_CARRETERA = 120;
    private static String colorPatente = "Naranja"; //Le pertence a la clase y cualquier objeto puede acceder a ella
    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    //Sobrecarga de constructores
    public Automovil(){
        this.id =++uId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo);
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);//Reutilizando las inicializaciones de los atributos
        this.conductor = conductor;
        this.ruedas = ruedas;
    }
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static int getCapacidadTanqueStatico() {
        return capacidadTanqueStatico;
    }

    public static void setCapacidadTanqueStatico(int capacidadTanqueStatico) {
        Automovil.capacidadTanqueStatico = capacidadTanqueStatico;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null){
            this.estanque = new Estanque(); //Asignar el objeto cuando sea null (no lo estemos invocando)
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    public Automovil addRueda(Rueda rueda){
        if(indRuedas < this.ruedas.length) {
            this.ruedas[indRuedas++] = rueda;
        }
        return this;
    }
    public static void setColorPatente(String colorPatente) {// No se puede usar this en un contexto estatico
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle(){
        String detalle =  "\nId = "+id+
                "\nFabricante = " + this.getFabricante() +
                "\nModelo = " + this.getModelo() +
                //Obtenemos los datos deacuerdo con el metodo de TipoAutomovil
                "\nNombre = " + this.getTipo().getNombre()+
                "\nDescripción = " + this.getTipo().getDescripcion()+
                "\nNúmero de puertas = " + this.getTipo().getNumeroPuertas()+
                "\nColor = " + this.getColor() +
                "\nCilindrada = " + this.motor.getCilindrada() + //Obtenemos el metodo a travez del componente motor
                "\nColor patente = " + colorPatente;
        return detalle;
    }
    public String acelerar(int rpm){
        return "El auto " + this.getFabricante() + " acelerando a " + rpm + " rpm";
    }
    public String frenar(){
        return this.getFabricante() + " " + this.getModelo() + " frenando!";
    }
    public String acelerarFrenar(int rpm){
        String acelerar =  this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.estanque.getCapacidad()*porcentajeBencina);
    }
    //Sobrecarga de metodos
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.estanque.getCapacidad()*(porcentajeBencina/100f));
    }
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/(Automovil.getCapacidadTanqueStatico()*(porcentajeBencina/100f));
        //En un metodo estatico no se pueden utilizar  atributos que no sean estaticos o argumentos
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Automovil)){//Validar que el onjeto sea tipo automovil
            return false;
        }
        Automovil a = (Automovil)obj; //Casteamos el objeto de la clase Automovil
        return (this.fabricante!=null && this.fabricante.equals(a.getFabricante()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadTanque=" + estanque.getCapacidad() +
                '}';
    }

    @Override
    public int compareTo(Automovil a) {
        //Automovil a = (Automovil) o;//Cast
        return this.fabricante.compareTo(a.fabricante);
    }
}
