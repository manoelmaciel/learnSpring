function propertiesService(filter) {
	$.ajax({
		type: "GET",
		url: "/api/find/" + filter,
		data: '$format=json',
		dataType: 'json',
		success: function(data) {
			var total = 0;
			$.each(data, function(d, results) {
				$("#propTable	tbody").append(
					"<tr>"
					+ "<td	class=\"text-nowrap\">"
					+ results.categoria
					+ "</td>" + "<td	class=\"text-nowrap\">"
					+ results.subcategoria
					+ "</td>" + "<td	class=\"text-nowrap\">"
					+ results.nome
					+ "</td>" + "<td	class=\"text-nowrap\">"
					+ results.valor
					+ "</td>" + "<td	class=\"text-nowrap\">"
					+ results.descricao
					+ "</td>"
					+ "</tr>")
				total++;
			})
			$("#results").text(total + "	found");
		}
	});
};

propertiesService('server.port');
