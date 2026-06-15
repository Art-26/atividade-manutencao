<?php

namespace Tests\Unit;

use Tests\TestCase;
use App\Agendamento;
use App\Services\GoogleCalendarService;
use Exception;

class GoogleCalendarServiceTest extends TestCase
{
    /** @test */
    public function deve_sincronizar_agendamento_com_sucesso_no_caminho_feliz()
    {
        $agendamento = new Agendamento([
            'data_horario_inicio' => '2026-06-15 14:00:00',
            'data_horario_fim' => '2026-06-15 16:00:00',
            'observacao' => 'Teste Caminho Feliz Unicesumar'
        ]);

        $service = new GoogleCalendarService();
        $resultado = $service->sync($agendamento);

        $this->assertTrue($resultado);
    }

    /** @test */
    public function deve_lancar_excecao_quando_dados_do_agendamento_forem_invalidos()
    {
        $agendamento = new Agendamento([
            'data_horario_inicio' => 'data-completamente-invalida',
            'data_horario_fim' => 'outra-data-invalida'
        ]);

        $this->expectException(Exception::class);

        $service = new GoogleCalendarService();
        $service->sync($agendamento);
    }
          }
