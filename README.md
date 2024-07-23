# Projeto HTML Generator

Este projeto fornece uma API fluida para gerar HTML de forma programática, utilizando uma abordagem baseada em classes. É útil para gerar conteúdo HTML dinâmico em Java.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **`HtmlGenerator`** (Interface): Interface para a geração de HTML.
- **`Html`** (Implementação de `HtmlGenerator`): Implementa a geração de HTML com suporte para elementos como `head` e `body`.
- **`HtmlElement`** (Classe Base): Classe base para todos os elementos HTML, fornecendo métodos comuns e estrutura para renderização.
- **`Div`**, **`Table`**, **`Tr`**, **`Td`**, **`Thead`**, **`Tbody`**, **`Ul`**, **`Li`**: Classes específicas para diferentes elementos HTML.

## Funcionalidades

### Elementos HTML

Cada classe representa um tipo específico de elemento HTML e fornece métodos para adicionar atributos, configurar conteúdo e aninhar outros elementos. Abaixo estão algumas das classes e seus métodos:

- **`Div`**: Representa uma `<div>`. Métodos para adicionar outros elementos HTML e configurar atributos como `class` e `id`.
- **`Table`**: Representa uma `<table>`. Pode conter `thead`, `tbody`, e `tfoot`.
- **`Tr`**: Representa uma `<tr>`. Pode conter `th` e `td`.
- **`Td`**: Representa uma `<td>`. Método `iterable` para criar múltiplas células de uma vez.
- **`Thead`**: Representa o cabeçalho da tabela (`<thead>`).
- **`Tbody`**: Representa o corpo da tabela (`<tbody>`).
- **`Ul`**: Representa uma lista não ordenada (`<ul>`). Método `iterable` para criar múltiplos itens de lista (`<li>`).
- **`Header`**: Representa um cabeçalho (`<header>`).
- **`Section`**: Representa uma seção (`<section>`).



### Método `iterable`

O método `iterable` permite gerar múltiplos elementos dentro de um contêiner. É útil para criar linhas de uma tabela ou itens de uma lista a partir de uma lista de dados.


Aqui está um exemplo de como usar o gerador de HTML para criar uma tabela:

```java
    package dtm.generator;

import java.util.Arrays;
import java.util.List;

import dtm.generator.html.Html;
import dtm.generator.html.core.HtmlGenerator;

public class Main {
    public static void main(String[] args) throws Exception{
        List<String> headers = Arrays.asList(
            "Cabecalho 1",
            "Cabecalho 2",
            "Cabecalho 3",
            "Cabecalho 4"
        );
        List<List<String>> data = Arrays.asList(
            Arrays.asList("Dado 1", "Dado 2", "Dado 3", "Dado 4"),
            Arrays.asList("Dado 5", "Dado 6", "Dado 7", "Dado 8"),
            Arrays.asList("Dado 9", "Dado 10", "Dado 11", "Dado 12")
        );
        String path = "saida.html";
        HtmlGenerator html = new Html();
        String contentString = html.head(h -> h
            .title("teste")
            .meta("charset=\"UTF-8\"")
        )
        .body(b -> b
            .div(d1 -> d1
            .h1("Tabela de Exemplo", "h1teste")
                .setClass("container")
                .div(di1 -> di1
                    .table(t -> t
                        .setClass("tableId")
                        .thead(th -> th
                            .tr(tr -> tr
                                .iterableTh(headers, (rowCell, trth) -> 
                                    trth.text(rowCell)
                                )
                            )
                        )
                        .tbody(tb -> tb
                            .iterable(data, (rowData, tbtr) -> 
                                tbtr.iterableTd(rowData, (rowCell, trtd) -> 
                                    trtd.text(rowCell)
                                )
                            )
                            
                        )
                    )
                )
            )
        )
        .render();
        html.createFile(path);
        System.out.println(contentString);
    }
}
```

# Contribuição

Se você deseja contribuir para o projeto, siga os seguintes passos:

1. Faça um fork do repositório.
2. Crie uma branch para suas alterações.
3. Envie um pull request com uma descrição clara das alterações.

# Licença

Este projeto é licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

