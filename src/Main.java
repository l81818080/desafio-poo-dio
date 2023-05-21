import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas: "+ devLucas.getConteudoInscritos());
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Lucas: "+ devLucas.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Lucas: "+ devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXp());

        System.out.println("---------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: "+ devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila: "+ devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Camila: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
    }
}