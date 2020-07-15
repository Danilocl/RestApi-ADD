package br.com.api.services.implementations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.api.models.Aluno;
import br.com.api.models.Endereco;
import br.com.api.models.Escola;
import br.com.api.models.Turma;
import br.com.api.services.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	private final AtomicLong counter = new AtomicLong();

	@Override
	public List<Aluno> findAll() {
		ArrayList<Aluno> listAnluno = new ArrayList<>();
		Aluno alunos = new Aluno();
		Turma turma = new Turma();
		Escola escola = new Escola();
		Endereco end = new Endereco();

		Aluno alunos1 = new Aluno();
		Turma turma1 = new Turma();
		Escola escola1 = new Escola();
		Endereco end1 = new Endereco();

		Aluno alunos2 = new Aluno();
		Turma turma2 = new Turma();
		Escola escola2 = new Escola();
		Endereco end2 = new Endereco();

		Aluno alunos3 = new Aluno();
		Turma turma3 = new Turma();
		Escola escola3 = new Escola();
		Endereco end3 = new Endereco();

		Date data = new Date();

		String[] bairros = { "Vila Valqueire", "Oswaldo cruz", "Madureira", "Vila Valqueire" };

		String[] escolas = { "Elite", "Hum", "CE Charles Chaplin", "Colégio Pentágono Ltda" };

		String[] nomes = { "Danilo", "Ricardo", "Jéssica", "Mike" };

		String[] cidades = { "Rio de Janeiro", "Espírito Santo", "São Paulo", "Minas gerais" };

		String[] logradouros = { "aeroporto", "alameda", "área", "avenida" };

		end.setBairro(bairros[0]);
		end.setCidade(cidades[0]);
		end.setComplemento("apt 20");
		end.setEstado(cidades[0]);
		end.setLogadouro(logradouros[0]);

		escola.setEndereco(end);
		escola.setId((int) counter.incrementAndGet());
		escola.setNome(escolas[0]);

		turma.setCapacidade(10);
		turma.setId((int) counter.incrementAndGet());
		turma.setNome("Turma: " + 1);
		turma.setEscola(escola);

		alunos.setId((int) counter.incrementAndGet());
		alunos.setDataNasc(data);
		alunos.setNome(nomes[0]);
		alunos.setTurma(turma);

		listAnluno.add(alunos);

		/*******************************/

		end1.setBairro(bairros[1]);
		end1.setCidade(cidades[1]);
		end1.setComplemento("apt 30");
		end1.setEstado(cidades[1]);
		end1.setLogadouro(logradouros[1]);

		escola1.setEndereco(end1);
		escola1.setId((int) counter.incrementAndGet());
		escola1.setNome(escolas[1]);

		turma1.setCapacidade(15);
		turma1.setId((int) counter.incrementAndGet());
		turma1.setNome("Turma: " + 2);
		turma1.setEscola(escola1);

		alunos1.setId((int) counter.incrementAndGet());
		alunos1.setDataNasc(data);
		alunos1.setNome(nomes[1]);
		alunos1.setTurma(turma1);

		listAnluno.add(alunos1);

		/********************************************/

		end2.setBairro(bairros[2]);
		end2.setCidade(cidades[2]);
		end2.setComplemento("apt 40");
		end2.setEstado(cidades[2]);
		end2.setLogadouro(logradouros[2]);

		escola2.setEndereco(end2);
		escola2.setId((int) counter.incrementAndGet());
		escola2.setNome(escolas[2]);

		turma2.setCapacidade(20);
		turma2.setId((int) counter.incrementAndGet());
		turma2.setNome("Turma: " + 3);
		turma2.setEscola(escola2);

		alunos2.setId((int) counter.incrementAndGet());
		alunos2.setDataNasc(data);
		alunos2.setNome(nomes[2]);
		alunos2.setTurma(turma2);

		listAnluno.add(alunos2);

		/********************************************/

		end3.setBairro(bairros[3]);
		end3.setCidade(cidades[3]);
		end3.setComplemento("apt 50");
		end3.setEstado(cidades[3]);
		end3.setLogadouro(logradouros[3]);

		escola3.setEndereco(end3);
		escola3.setId((int) counter.incrementAndGet());
		escola3.setNome(escolas[3]);

		turma3.setCapacidade(40);
		turma3.setId((int) counter.incrementAndGet());
		turma3.setNome("Turma: " + 3);
		turma3.setEscola(escola3);

		alunos3.setId((int) counter.incrementAndGet());
		alunos3.setDataNasc(data);
		alunos3.setNome(nomes[3]);
		alunos3.setTurma(turma3);

		listAnluno.add(alunos3);

		return listAnluno;
	}

}
