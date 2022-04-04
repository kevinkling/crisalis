function eliminarCliente(id) {
	swal({
		title: "Esta seguro de eliminar?",
		text: "Once deleted, you will not be able to recover this imaginary file!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarCliente/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Poof! Your imaginary file has been deleted!", {
					icon: "success",
				}).then(() => {
					if (OK) {
						location.href = "/clientes"
					}
				});
			} else {
				swal("Your imaginary file is safe!");
			}
		});
}

function eliminarServicio(id) {
	swal({
		title: "Esta seguro de eliminar?",
		text: "Once deleted, you will not be able to recover this imaginary file!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarServicio/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Poof! Your imaginary file has been deleted!", {
					icon: "success",
				}).then(() => {
					if (OK) {
						location.href = "/listarServicios"
					}
				});
			} else {
				swal("Your imaginary file is safe!");
			}
		});
}
function eliminarProducto(id) {
	swal({
		title: "Esta seguro de eliminar?",
		text: "Once deleted, you will not be able to recover this imaginary file!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarProducto/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Poof! Your imaginary file has been deleted!", {
					icon: "success",
				}).then(() => {
					if (OK) {
						location.href = "/listarProductos"
					}
				});
			} else {
				swal("Your imaginary file is safe!");
			}
		});
}