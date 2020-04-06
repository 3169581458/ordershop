<template>
	<el-container>
		<el-header height="120px">欢迎光临熊本熊炸鸡店</el-header>
		<el-container>
			<template class="selectview">
				<el-tabs :tab-position="tabPosition" style="height: 100%; width: 100%;">
					
					<el-tab-pane label="汉堡">
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
					</el-tab-pane>
					
					<el-tab-pane label="炸鸡">
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
					</el-tab-pane>
					
					<el-tab-pane label="披萨">
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
					</el-tab-pane>
					
					<el-tab-pane label="甜点">
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
					</el-tab-pane>
					
					<el-tab-pane label="饮料">
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
					</el-tab-pane>
					
					<el-tab-pane label="套餐">
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
					</el-tab-pane>
				</el-tabs>
			</template>
		</el-container>
	</el-container>
</template>

<style>
	.el-header {
		background-color: #fa541c;
		text-align: center;
		line-height: 120px;
		font-size: 30px;
		color: #FFFFFF;
		margin-top: 30px;
	}

	.el-tab-pane {
		font-size: 30px;
	}
</style>

<script>
	export default {
		data() {
			return {
				tabPosition: 'left',
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
					},
					{
						name:'aa',
						price:'11'
					},
					{
						name:'bb',
						price:'22'
					},
					{
						name:'cc',
						price:'33'
					}
				]
			};
		}
	};
</script>
