public class Celda {
    private char simbolo;
    private boolean ocupada;
    
    public Celda() {
        this.simbolo = ' ';
        this.ocupada = false;
    }
    
    public char getSimbolo() {
        return simbolo;
    }
    
    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
    public boolean isOcupada() {
        return ocupada;
    }
    
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    public String toString() {
        return String.valueOf(simbolo);
    }
}

public class Tablero {
    private Celda[][] tableroDeJuego;
    
    public Tablero() {
        this.tableroDeJuego = new Celda[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                this.tableroDeJuego[i][j] = new Celda();
            }
        }
    }
    
    public Celda getCelda(int fila, int columna) {
        return tableroDeJuego[fila][columna];
    }
    
    public void setCelda(int fila, int columna, char simbolo) {
        this.tableroDeJuego[fila][columna].setSimbolo(simbolo);
        this.tableroDeJuego[fila][columna].setOcupada(true);
    }
    
    public String toString() {
        String tableroStr = "";
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                tableroStr += "[" + this.tableroDeJuego[i][j] + "]";
            }
            tableroStr += "\n";
        }
        return tableroStr;
    }
}

public class Jugador {
    private char simbolo;
    
    public Jugador(char simbolo) {
        this.simbolo = simbolo;
    }
    
    public char getSimbolo() {
        return simbolo;
    }
}

public class Juego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private boolean finDePartida;
    private Jugador ganador;
    
    public Juego() {
        this.tablero = new Tablero();
        this.jugador1 = new Jugador('X');
        this.jugador2 = new Jugador('O');
        this.finDePartida = false;
        this.ganador = null;
    }
    
    public void empezarPartida() {
        int fila, columna;
        Jugador jugadorActual = this.jugador1;
        while(!this.finDePartida) {
            System.out.println(this.tablero);
            System.out.println("Turno del jugador " + jugadorActual.getSimbolo());
            fila = pedirCoordenada("fila");
            columna = pedirCoordenada("columna");
            while(!this.tablero.getCelda(fila, columna).isOcupada()) {
                this.tablero.setCelda(fila, columna, jugadorActual.getSimbolo());
                if(comprobarVictoria(jugadorActual)) {
                    System.out.println(this.tablero);
                    System.out.println("¡Ha ganado el jugador " + jugadorActual.getSimbolo() + "!");