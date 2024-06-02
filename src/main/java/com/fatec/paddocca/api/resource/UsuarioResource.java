package com.fatec.paddocca.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.paddocca.api.dto.ClienteDTO;
import com.fatec.paddocca.api.dto.EntregadorDTO;
import com.fatec.paddocca.api.dto.PadariaDTO;
import com.fatec.paddocca.api.dto.UsuarioDTO;
import com.fatec.paddocca.exception.ErroAutenticacao;
import com.fatec.paddocca.exception.RegraNegocioException;
import com.fatec.paddocca.model.entity.Cliente;
import com.fatec.paddocca.model.entity.Entregador;
import com.fatec.paddocca.model.entity.Padaria;
import com.fatec.paddocca.model.entity.Usuario;
import com.fatec.paddocca.model.enums.TipoPerfil;
import com.fatec.paddocca.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioResource {
    private final UsuarioService service;

    @PostMapping("/autenticar")
    public ResponseEntity autenticar(@RequestBody UsuarioDTO dto) {
        try {
            Usuario usuarioAutenticado = service.autenticar(dto.getEmail(), dto.getSenha());
            return ResponseEntity.ok(usuarioAutenticado);
        } catch (ErroAutenticacao e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/cliente")
    public ResponseEntity salvarCliente(@RequestBody ClienteDTO dto) {
        Usuario usuario = Cliente.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .senha(dto.getSenha())
                .cpf(dto.getCpf())
                .dataNascimento(dto.getDataNascimento())
                .endereco(dto.getEndereco())
                .telefone(dto.getTelefone())
                .tipoPerfil(TipoPerfil.CLIENTE)
                .build();

        try {
            Usuario usuarioSalvo = service.salvarUsuario(usuario);
            return new ResponseEntity(usuarioSalvo, HttpStatus.CREATED);
        } catch (RegraNegocioException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/padaria")
    public ResponseEntity salvarPadaria(@RequestBody PadariaDTO dto) {
        Usuario usuario = Padaria.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .senha(dto.getSenha())
                .cnpj(dto.getCnpj())
                .endereco(dto.getEndereco())
                .telefone(dto.getTelefone())
                .tipoPerfil(TipoPerfil.PADARIA)
                .build();

        try {
            Usuario usuarioSalvo = service.salvarUsuario(usuario);
            return new ResponseEntity(usuarioSalvo, HttpStatus.CREATED);
        } catch (RegraNegocioException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/entregador")
    public ResponseEntity salvarEntregador(@RequestBody EntregadorDTO dto) {
        Usuario usuario = Entregador.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .senha(dto.getSenha())
                .cpf(dto.getCpf())
                .dataNascimento(dto.getDataNascimento())
                .telefone(dto.getTelefone())
                .tipoPerfil(TipoPerfil.ENTREGADOR)
                .build();

        try {
            Usuario usuarioSalvo = service.salvarUsuario(usuario);
            return new ResponseEntity(usuarioSalvo, HttpStatus.CREATED);
        } catch (RegraNegocioException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
