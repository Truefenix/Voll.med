package med.voll.api.controller;

public record DadoCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
