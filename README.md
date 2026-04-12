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
0.000000
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
0.000000
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
14
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
0
-24
INTEIRO: 1
REAL: 1.0000
ZERO
        </pre>
      </td>
    </tr>
  </tbody>
</table>
