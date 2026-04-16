<h2>1. 💰 O Cofre das Variáveis</h2>

<p>
Uma instituição financeira armazena saldos de contas usando três tipos diferentes de dados:
<strong>inteiro</strong>, <strong>ponto flutuante (float)</strong> e 
<strong>ponto flutuante de dupla precisão (double)</strong>.
</p>

<p>
Dado um valor monetário lido como <code>string</code> no formato 
<code>XXXXX.CC</code> (onde <code>X</code> são dígitos inteiros e <code>C</code> são centavos),
o sistema precisa convertê-lo para cada tipo, realizar uma operação aritmética e reportar os resultados —
incluindo as perdas de precisão geradas pelas conversões.
</p>

<h3>📥 Entrada</h3>
<p>
Uma linha com um número real positivo no formato decimal com duas casas fracionárias 
(ex.: <code>1234.56</code>).<br>
O valor estará sempre entre <code>0.01</code> e <code>99999.99</code>.
</p>

<h3>📤 Saída</h3>
<p>Quatro linhas, nesta ordem:</p>

<ol>
  <li>O valor como inteiro (truncado, sem arredondamento) — ex.: <code>1234</code></li>
  <li>O valor como <code>float</code> (precisão de 2 casas decimais) — ex.: <code>1234.56</code></li>
  <li>O valor como <code>double</code> (precisão de 2 casas decimais) — ex.: <code>1234.56</code></li>
  <li>A diferença absoluta entre <code>float</code> e <code>double</code>, com 6 casas decimais — ex.: <code>0.000000</code></li>
</ol>

<h3>📌 Exemplos</h3>

<table border="1" cellpadding="6" cellspacing="0">
  <thead>
    <tr>
      <th>Entrada</th>
      <th>Saída Esperada</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>1234.56</code></td>
      <td>
        <pre>
1234
1234.56
1234.56
0.000059
        </pre>
      </td>
    </tr>
    <tr>
      <td><code>0.01</code></td>
      <td>
        <pre>
0
0.01
0.01
0.000000
        </pre>
      </td>
    </tr>
    <tr>
      <td><code>99999.99</code></td>
      <td>
        <pre>
99999
99999.99
99999.99
0.002187
        </pre>
      </td>
    </tr>
  </tbody>
</table>

<h2>2. 🧠 O Avaliador de Expressões</h2>

<p>
Em uma competição de lógica matemática, os participantes devem avaliar expressões aritméticas compostas 
sem o auxílio de calculadora.
</p>

<p>
Seu programa deve avaliar uma expressão com os quatro operadores básicos e reportar o resultado, 
além de identificar se a expressão gerou divisão inteira ou real — expondo as regras de 
<strong>precedência</strong> e <strong>associatividade</strong> da linguagem usada.
</p>

<h3>📥 Entrada</h3>
<p>
Três inteiros <code>A</code>, <code>B</code> e <code>C</code> 
(<code>−1000 ≤ A, B, C ≤ 1000</code>, <code>C ≠ 0</code>), cada um em uma linha separada.
</p>

<h3>📤 Saída</h3>
<p>Cinco linhas, nesta ordem:</p>

<ol>
  <li>Resultado de <code>A + B * C</code> (demonstra precedência: <code>*</code> antes de <code>+</code>)</li>
  <li>Resultado de <code>A * B + B * C</code> (associatividade à esquerda)</li>
  <li>Resultado de <code>A / B / C</code> usando divisão <strong>INTEIRA</strong> (escreva <code>INTEIRO: X</code>)</li>
  <li>Resultado de <code>A / B / C</code> usando divisão <strong>REAL</strong> com 4 casas decimais (escreva <code>REAL: X.XXXX</code>)</li>
  <li><code>POSITIVO</code>, <code>NEGATIVO</code> ou <code>ZERO</code> conforme o sinal de <code>A + B * C</code></li>
</ol>

<p>
<strong>Atenção:</strong> <code>B</code> pode ser 0. Se <code>B = 0</code>, as linhas 3 e 4 devem escrever <code>INDEFINIDO</code>.
</p>

<h3>📌 Exemplos</h3>

<table border="1" cellpadding="6" cellspacing="0">
  <thead>
    <tr>
      <th>Entrada</th>
      <th>Saída Esperada</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <pre>
3
4
2
        </pre>
      </td>
      <td>
        <pre>
11
20
INTEIRO: 0
REAL: 0.3750
POSITIVO
        </pre>
      </td>
    </tr>
    <tr>
      <td>
        <pre>
10
0
5
        </pre>
      </td>
      <td>
        <pre>
10
0
INDEFINIDO
INDEFINIDO
POSITIVO
        </pre>
      </td>
    </tr>
    <tr>
      <td>
        <pre>
-6
3
-2
        </pre>
      </td>
      <td>
        <pre>
-12
-24
INTEIRO: 1
REAL: 1.0000
NEGATIVO
        </pre>
      </td>
    </tr>
  </tbody>
</table>

<h2>3. 🧩 O Classificador de Tipos</h2>

<p>
Um sistema de diagnóstico recebe <strong>N valores</strong> e precisa classificá-los dinamicamente:
determinar se cada um é <strong>inteiro</strong>, <strong>real</strong> ou <strong>booleano</strong> em Python — 
e comparar com o comportamento estático de Java, onde o tipo é fixo em compilação.
</p>

<p>
Isso expõe a diferença entre <strong>tipagem dinâmica</strong> e <strong>tipagem estática</strong>.
</p>

<h3>📥 Entrada</h3>
<p>
Primeira linha: inteiro <code>N</code> (<code>1 ≤ N ≤ 10</code>) — número de valores.<br>
As <code>N</code> linhas seguintes: cada uma contém uma <code>string</code> representando um valor:
</p>

<ul>
  <li>Inteiro (ex.: <code>42</code>)</li>
  <li>Decimal com ponto (ex.: <code>3.14</code>)</li>
  <li>Booleano (<code>True</code> ou <code>False</code>)</li>
</ul>

<h3>📤 Saída (Python)</h3>
<p>Para cada valor:</p>

<ul>
  <li>Exibir o tipo detectado: <code>int</code>, <code>float</code> ou <code>bool</code></li>
  <li>Exibir o valor convertido</li>
  <li>Se for <code>bool</code>, exibir também o inteiro equivalente</li>
</ul>

<p>
Após os <code>N</code> valores, exibir a <strong>SOMA</strong> de todos os valores numéricos 
(<code>int + float</code>) com <strong>2 casas decimais</strong>.
</p>

<h3>⚠️ Observação</h3>
<p>
Teste <code>'True'</code> / <code>'False'</code> <strong>ANTES</strong> de testar <code>int</code> ou <code>float</code>.
</p>

<p>
Em Python, <code>bool</code> é subclasse de <code>int</code>:
</p>

<pre>
isinstance(True, int)  # True
</pre>

<h3>📌 Exemplo</h3>

<table border="1" cellpadding="6" cellspacing="0">
  <thead>
    <tr>
      <th>Entrada</th>
      <th>Saída Esperada</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <pre>
4
42
3.14
True
7
        </pre>
      </td>
      <td>
        <pre>
int: 42
float: 3.14
bool: True (int=1)
int: 7
SOMA: 52.14
        </pre>
      </td>
    </tr>
  </tbody>
</table>

<h3>🛠️ Exigências de Construção</h3>

<p><strong>Python:</strong></p>
<ul>
  <li>Usar <code>isinstance()</code> na ordem: <code>bool</code>, <code>int</code>, <code>float</code></li>
  <li>Usar <code>try/except</code> para conversões (bool → int → float)</li>
  <li>Usar lista para acumular valores</li>
  <li>Calcular soma com <code>sum()</code> ou <code>+=</code></li>
</ul>

<p><strong>Java:</strong></p>
<ul>
  <li>Implementar equivalente usando <code>double</code></li>
  <li>Comentar onde Java não determina tipo dinamicamente</li>
</ul>

<h3>📚 Conceitos Envolvidos</h3>
<ul>
  <li><strong>Cap. 6:</strong> Tipagem dinâmica vs estática, coerção <code>bool → int</code> em Python</li>
  <li><strong>Cap. 7:</strong> Uso do operador <code>+=</code></li>
</ul>

