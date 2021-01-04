package emailapp;

import java.util.Scanner;

public class Email {

    private String primeiroNome;
    private String ultimoNome;
    private String password;
    private String departamento;
    private String email;
    private String dominioEmpresa = "xpt.com";
    private int capacidadeCaixa = 500;
    private int numCaracterPassword = 10;
    private String emailAlternativo;

    //Constructor com o primeiro e ultimo nome    
    public Email(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        System.out.println("Email criado: " + this.primeiroNome + " " + this.ultimoNome);

        //Chamar um metodo para pedir a empresa, e retornar a empresa
        this.departamento = setDepartamento();
        System.out.println("Departamento: " + this.departamento);

        //Chamar metodo que retorne password aleatoria
        this.password = passwordAleatoria(numCaracterPassword);
        System.out.println("A sua Password e: " + this.password);

        //Combinar elementos para gerar email
        email = primeiroNome.toLowerCase() + "." + ultimoNome.toLowerCase() + "@" + departamento.toLowerCase() + "." + dominioEmpresa;
        System.out.println("O seu email e: " + email);
    }

    //Pedir a departamento
    private String setDepartamento() {
        System.out.println("Indtroduza departamento:\n 1 Vendas\n 2 Desenvolvimento\n 3 Contabilidade\n 0 Nenhum acima");
        Scanner in = new Scanner(System.in);
        int escolhaDepartamento = in.nextInt();
        if (escolhaDepartamento == 1) {
            return "Vendas";
        } else if (escolhaDepartamento == 2) {
            return "Desenvolvimento";
        } else if (escolhaDepartamento == 3) {
            return "Contabilidade";
        } else {
            return "";
        }
    }

    //Gerar pessword aleatoria
    private String passwordAleatoria(int numCaracteres) {
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[numCaracteres];
        for (int i = 0; i < numCaracteres; i++) {
            int aleatorio = (int) (Math.random() * setPassword.length());
            password[i] = setPassword.charAt(aleatorio);
        }
        return new String(password);
    }

    //Determinar capacidade da caixa de correio
    public void setCapacidadeCaixa(int capacidade) {
        this.capacidadeCaixa = capacidade;
    }

    //Determinar email alternativo
    public void setEmailAlternativo(String emailAlt) {
        this.emailAlternativo = emailAlt;
    }

    //Mudar a password
    public void alterarPass(String password) {
        this.password = password;
    }

    public int getCapacidadeCaixa() {
        return capacidadeCaixa;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public String getPassword() {
        return password;
    }

    public String mostrarInfo() {
        return "NOME: " + primeiroNome + " " + ultimoNome
                + "\nEMAIL PROFISSIONAL: " + email
                + "\nCAPACIDADE EMAIL: " + capacidadeCaixa + " Mb.";
    }
}
