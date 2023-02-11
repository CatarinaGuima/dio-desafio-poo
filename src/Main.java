import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Instanciando o objeto da classe Curso.
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("Curso Java para iniciantes");
        c1.setCargaHoraria(8);
        //System.out.println(c1.toString());
        Curso c2 = new Curso();
        c2.setTitulo("Phyton");
        c2.setDescricao("Curso Phyton para intermediários");
        c2.setCargaHoraria(12);
        //System.out.println(c2.toString());

        //Instanciando o objeto da classe Mentoria.
        Mentoria m1 = new Mentoria();
        m1.setTitulo("C#");
        m1.setDescricao("mentoria C# para avançados");
        m1.setData(LocalDate.now()); //cria o objeto na data de criação.
        //System.out.println(m1.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m1);

        Dev dev1 = new Dev();
        dev1.setNome("Catarina");
        dev1.inscreverBootcamp(bootcamp);
        //System.out.println("Conteúdos inscritos " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("*");
        System.out.println("Conteúdos inscritos " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("****************************");

        Dev dev2 = new Dev();
        dev2.setNome("Pedro");
        dev2.inscreverBootcamp(bootcamp);
        //System.out.println("Conteúdos inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("*");
        System.out.println("Conteúdos inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
