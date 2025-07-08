import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso completo Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Spring");
        curso2.setDescricao("Curso API Rest com Spring");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Roadmap Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp TONNIE Java");
        bootcamp.setDescricao("Bootcamp Java Developer DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuccas = new Dev();
        devLuccas.setNome("Luccas");
        devLuccas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devLuccas.getConteudosInscritos());
        devLuccas.progredir();
        System.out.println("Conteudos Inscritos:" + devLuccas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + devLuccas.getConteudosConcluidos());
        System.out.println("XP: " + devLuccas.calcularTotalXp());

        System.out.println("----------------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("XP: " + devJoao.calcularTotalXp());
        System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());



    }
}