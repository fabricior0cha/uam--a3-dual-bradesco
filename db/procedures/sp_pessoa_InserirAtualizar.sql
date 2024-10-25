CREATE PROCEDURE sp_pessoa_InserirAtualizar(
  IN ID INT,
  IN NOME VARCHAR(100),
  IN CPF VARCHAR(11),
  IN DATA_NASCIMENTO DATE
)
BEGIN
  IF EXISTS(SELECT 1 FROM TB_PESSOA WHERE pessoa_id = ID) THEN
    UPDATE TB_PESSOA
    SET pessoa_nome = NOME,
        pessoa_cpf = CPF,
        pessoa_dt_nascimento = DATA_NASCIMENTO
    WHERE pessoa_id = ID;
  ELSE
    INSERT INTO TB_PESSOA (
        pessoa_nome,
        pessoa_cpf,
        pessoa_dt_nascimento
    ) VALUES (
        NOME,
        CPF,
        DATA_NASCIMENTO
    );
  END IF;
END
