create table Libros (
	isbn LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	autor VARCHAR(75) null,
	titulo VARCHAR(75) null,
	numeroPaginas INTEGER
);