<%@include file="common/header.jspf"%>
<body class="bg-gray-600 flex flex-col items-center min-h-screen">
	<%@include file="common/navigation.jspf"%>
	<div class="w-3/4 mt-10">
		<h1 class="text-white text-3xl font-bold text-center mb-6">Your
			Todos</h1>

		<div class="overflow-hidden rounded-lg shadow-lg">
			<table class="min-w-full text-center border-collapse">
				<thead class="bg-gray-500 text-white">
					<tr>
						<th class="py-2 px-4 font-semibold">Description</th>
						<th class="py-2 px-4 font-semibold">Target Date</th>
						<th class="py-2 px-4 font-semibold">Completed?</th>
						<th class="py-2 px-4 font-semibold">Manage</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr class="even:bg-gray-300 odd:bg-gray-200">
							<td class="py-2 px-4">${todo.description}</td>
							<td class="py-2 px-4">${todo.targetDate}</td>
							<td class="py-2 px-4">${todo.done}</td>
							<td><a href="/delete-todo?id=${todo.id}"
								class="inline-block rounded bg-red-400 hover:bg-red-700 px-4 py-2 text-sm text-white font-semibold m-1.5 text-center transition duration-150 ease-in-out shadow-lg cursor-pointer">Delete</a>
								<a href="/update-todo?id=${todo.id}"
								class="inline-block rounded bg-green-400 hover:bg-green-700 px-4 py-2 text-sm text-white font-semibold m-1.5 text-center transition duration-150 ease-in-out shadow-lg cursor-pointer">Update</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<button type="button" onclick="window.location.href='add-todo'"
			class="inline-block rounded bg-green-600 hover:bg-cyan-700 px-4 py-2 text-sm text-white font-semibold m-1.5 text-center transition duration-150 ease-in-out shadow-lg cursor-pointer">
			Add Todo</button>
	</div>
</body>
<%@include file="common/footer.jspf"%>
