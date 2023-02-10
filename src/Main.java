import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Instanciando o objeto da classe Curso.
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("Curso Java para iniciantes");
        c1.setCargaHoraria(8);
        System.out.println(c1.toString());
        Curso c2 = new Curso();
        c2.setTitulo("Phyton");
        c2.setDescricao("Curso Phyton para intermediários");
        c2.setCargaHoraria(12);
        System.out.println(c2.toString());

        //Instanciando o objeto da classe Mentoria.
        Mentoria m1 = new Mentoria();
        m1.setTitulo("C#");
        m1.setDescricao("mentoria C# para avançados");
        m1.setData(LocalDate.now()); //cria o objeto na data de criação.
        System.out.println(m1.toString());


    }
}
