<template>
	<el-table :data="tableData" stripe style="width: 100%">
		<el-table-column prop="name" label="商品名称" width="280" align='center'>
		</el-table-column>
		<el-table-column prop="price" label="价格" width="280" align='center'>
		</el-table-column>

		<el-table-column label="操作" align="center">
			<template slot-scope="scope">
				<el-button @click="handleAdd(scope.$index,scope.row)">添加至购物车</el-button>
			</template>
		</el-table-column>
	</el-table>
</template>

<script>
	export default {
		data() {
			return {
				tableData: [{
						name: '苹果',
						price: '5',
					},
					{
						name: '香蕉',
						price: '6'
					},
					{
						name: '西瓜',
						price: '7'
					},
					{
						name: '橘子',
						price: '8'
					}
				]
			}
		}
	}
</script>
