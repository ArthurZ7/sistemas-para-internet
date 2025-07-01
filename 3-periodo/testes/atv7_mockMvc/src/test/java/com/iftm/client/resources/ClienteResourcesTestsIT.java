package com.iftm.client.resources;

import java.time.Instant;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iftm.client.dto.ClientDTO;
import com.iftm.client.services.ClientService;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteResourcesTestsIT {
    @Autowired
    private MockMvc mockMVC;

    @Autowired
    private ClientService service;
    
    @Autowired
    private ObjectMapper objectMapper;

    
    
    /**
	 * Testa o endpoint GET /clients para buscar todos os clientes
	 */
	@Test
	 public void testarEndPointBuscarTodosClientes() throws Exception {
        // Assign - Não há dados específicos para configurar
		
		// Act - Executa requisição GET para /clients
		ResultActions result = mockMVC.perform(get("/clients")
        .accept(MediaType.APPLICATION_JSON));

        // Assert
        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.content").exists());
        result.andExpect(jsonPath("$.totalElements").exists());
        result.andExpect(jsonPath("$.totalPages").exists());
        result.andExpect(jsonPath("$.size").exists());
        result.andExpect(jsonPath("$.number").exists());

        // Verifica se o array de conteúdo não está vazio
        result.andExpect(jsonPath("$.content").isArray());
        result.andExpect(jsonPath("$.content", not(empty())));
        }

     /**
     * Testa o endpoint GET /clients/{id} para um ID que existe
     * Verifica se retorna status 200 OK e o JSON do cliente correto
     */
    @Test
    public void findByIdRetornarClienteQuandoIdExistir() throws Exception {
        // Arrange
        long idExistente = 3L;
        String nomeEsperado = "Clarice Lispector";
        String cpfEsperado = "10919444522";

        // Act
        ResultActions result = mockMVC.perform(get("/clients/id/{id}", idExistente)
                .accept(MediaType.APPLICATION_JSON));

        // Assert
        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.id").value(idExistente));
        result.andExpect(jsonPath("$.name").value(nomeEsperado));
        result.andExpect(jsonPath("$.cpf").value(cpfEsperado));
		result.andExpect(jsonPath("$.income").exists());
		result.andExpect(jsonPath("$.birthDate").exists());
		result.andExpect(jsonPath("$.children").exists());
    }

    /**
     * Testa o endpoint GET /clients/{id} para um ID que não existe
     * Verifica se retorna status 404 Not Found e a mensagem de erro correta
     */
    @Test
    public void findByIdRetornarNotFoundQuandoIdNaoExistir() throws Exception {
        // Arrange
        long idNaoExistente = 33L;

        // Act
        ResultActions result = mockMVC.perform(get("/clients/id/{id}", idNaoExistente)
                .accept(MediaType.APPLICATION_JSON));

        // Assert
        result.andExpect(status().isNotFound());
        result.andExpect(jsonPath("$.timestamp").exists());
        result.andExpect(jsonPath("$.status").value(404));
        result.andExpect(jsonPath("$.error").value("Resource not found"));
        result.andExpect(jsonPath("$.message").value("Entity not found"));
        result.andExpect(jsonPath("$.path").value("/clients/id/" + idNaoExistente));
    }


    /**
	 * Testa o endpoint GET /clients/income para validas os dados de Income dos clientes
	 */
	@Test
    public void testarEndPointQuandoClientesComRenda() throws Exception {
       // Assign
       double salarioResultado = 1000.00;

       // Act - Executa requisição GET para /clients/income
       ResultActions result = mockMVC.perform(get("/clients/income/")
       .param("income", String.valueOf(salarioResultado))
       .accept(MediaType.APPLICATION_JSON));

       // Assert
       result.andExpect(status().isOk());
       result.andExpect(jsonPath("$.content").exists());
       result.andExpect(jsonPath("$.totalElements").exists());
       result.andExpect(jsonPath("$.totalPages").exists());
       result.andExpect(jsonPath("$.size").exists());
       result.andExpect(jsonPath("$.number").exists());
    }

    @Test
    public void testarEndPointQuandoClientesSemRenda() throws Exception {
        // Assign
        double salarioResultado = 1000.00;

        // Act
        ResultActions result = mockMVC.perform(get("/clients/income/")
                .param("income", String.valueOf(salarioResultado))
                .accept(MediaType.APPLICATION_JSON));

        // Assert
        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.content").isArray());
        result.andExpect(jsonPath("$.content", empty()));
        result.andExpect(jsonPath("$.totalElements").value(0)); 
    }

    // --- findByIncomeGreaterThan ---

    /**
     * Testa o endpoint GET /clients/incomeGreaterThan para um income que deve retornar clientes.
     * Verifica se retorna status 200 OK e o JSON paginado com os clientes corretos.
     */
    @Test
    public void testarEndPointQuandoClientesComRendaMaior() throws Exception {
        // Arrange
        Double salarioResultado = 3000.00;

        // Act
        ResultActions result = mockMVC.perform(get("/clients//incomeGreaterThan/")
                .param("income", String.valueOf(salarioResultado))
                .accept(MediaType.APPLICATION_JSON));

        // Assert
        result.andExpect(status().isOk());
		result.andExpect(jsonPath("$.content").exists());
		result.andExpect(jsonPath("$.totalElements").exists());
    }

    /**
     * Testa o endpoint GET /clients/incomeGreaterThan para um income que não deve retornar clientes.
     * Verifica se retorna status 200 OK com uma lista vazia.
     */
    @Test
    public void testarEndPointQuandoClientesSemRendaMaior() throws Exception {
        // Arrange 
        Double salarioResultado = 15000.00;

        // Act
        ResultActions result = mockMVC.perform(get("/clients/incomeGreaterThan/")
                .param("income", String.valueOf(salarioResultado))
                .accept(MediaType.APPLICATION_JSON));

        // Assert
        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.content").isArray());
        result.andExpect(jsonPath("$.content", empty()));
        result.andExpect(jsonPath("$.totalElements").value(0));
    }

    /**
	 * Testa o endpoint GET /clients/cpfLike com CPF que existe
	 * Verifica se retorna status 200 OK e clientes com CPF similar
	 */
	@Test
	public void testarEndPointQuantoClienteCpfExistir() throws Exception {
		// Assign - Define parte do CPF que existe na base de dados
		String cpf = "123";

		// Act - Executa requisição GET para /clients/cpfLike
		ResultActions result = mockMVC.perform(get("/clients/cpf/")
				.param("cpf", cpf)
				.accept(MediaType.APPLICATION_JSON));

		// Assert - Verifica status e existência de conteúdo
		result.andExpect(status().isOk());
		result.andExpect(jsonPath("$.content").exists());
		result.andExpect(jsonPath("$.totalElements").exists());
	}

	/**
	 * Testa o endpoint GET /clients/cpfLike com CPF que não existe
	 * Verifica se retorna status 200 OK mas uma página vazia
	 */
	@Test
	public void testarEndPointQuantoClienteCpfNaoExistir() throws Exception {
		// Assign - Define CPF que não existe na base de dados
		String cpf = "99999";

		// Act - Executa requisição GET para /clients/cpfLike
		ResultActions result = mockMVC.perform(get("/clients/cpf/")
				.param("cpf", cpf)
				.accept(MediaType.APPLICATION_JSON));

		// Assert - Verifica status OK mas página vazia
		result.andExpect(status().isOk());
		result.andExpect(jsonPath("$.content").isEmpty());
		result.andExpect(jsonPath("$.totalElements").value(0));
	}

    /**
	 * Testa o endpoint PUT /clients/{id} com ID existente
	 * Verifica se retorna status 200 OK e os dados atualizados do cliente
	 */
	@Test
	public void AtualizarDeveRetornarOkClienteAtualizadoQuandoIdExistir() throws Exception {
		// Assign - Cria DTO com dados atualizados e converte para JSON
        Long IdExistente = 1L;

		ClientDTO updatedClientDTO = new ClientDTO(IdExistente, "Maria Silva Updated", "12345678900", 3500.0,
			Instant.parse("1990-05-15T10:30:00Z"), 2);
		String json = objectMapper.writeValueAsString(updatedClientDTO);

		// Act - Executa requisição PUT para /clients/{id}
		ResultActions result = mockMVC.perform(put("/clients/{id}", IdExistente)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));

		// Assert - Verifica status 200 e dados atualizados
		result.andExpect(status().isOk());
		result.andExpect(jsonPath("$.id").value(IdExistente));
		result.andExpect(jsonPath("$.name").value("Maria Silva Updated"));
		result.andExpect(jsonPath("$.income").value(3500.0));
		result.andExpect(jsonPath("$.children").value(2));
	}

	/**
	 * Testa o endpoint PUT /clients/{id} com ID inexistente
	 * Verifica se retorna status 404 Not Found e mensagem de erro adequada
	 */
	@Test
	public void AtualizarDeveRetornarOkClienteAtualizadoQuandoIdNaoExistir() throws Exception {
        Long IdInexistente = 10000L;

		// Assign - Cria DTO com ID inexistente e converte para JSON
		ClientDTO updatedClientDTO = new ClientDTO(IdInexistente, "Maria Silva Updated", "12345678900", 3500.0,
			Instant.parse("1990-05-15T10:30:00Z"), 2);
		String json = objectMapper.writeValueAsString(updatedClientDTO);

		// Act - Executa requisição PUT para /clients/{id} com ID inexistente
		ResultActions result = mockMVC.perform(put("/clients/{id}", IdInexistente)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));

		// Assert - Verifica status 404 e mensagem de erro
		result.andExpect(status().isNotFound());
		result.andExpect(jsonPath("$.error").value("Resource not found"));
	}
}
