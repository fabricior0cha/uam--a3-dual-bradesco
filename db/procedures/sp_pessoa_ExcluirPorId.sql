CREATE PROCEDURE sp_pessoa_ExcluirPorId(
	IN ID INT
	)
BEGIN
	DELETE FROM tb_pessoa WHERE pessoa_id = ID;
END
