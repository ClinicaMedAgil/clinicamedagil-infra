package br.com.paulocode.agenda_horarios.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agendamentoMedico")
public class AgendamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String especialidade;
    private String medico;
    private LocalDateTime dataHoraAgendamento;
    private String cliente;
    private LocalDateTime dataInsercao = LocalDateTime.now();
}
