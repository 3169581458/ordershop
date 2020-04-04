<template>
	<div class="about">
		<div style="margin-top: 15px;">
			<el-input placeholder="请输入内容" v-model="input3">
				<el-button slot="append" icon="el-icon-search">搜索</el-button>
			</el-input>
		</div>
		<el-table :data="tableData" stripe style="width: 100%">
			<el-table-column prop="name" label="商品名称" width="180" align='center'>
			</el-table-column>

			<el-table-column prop="price" label="价格" width="180" align='center'>
			</el-table-column>

			<el-table-column label="数量" align='center'>
				<template slot-scope="scope1">
					<el-input-number prop="number" controls-position="right" @change="handleChange" :min="1" :max="10"></el-input-number>
				</template>
			</el-table-column>

			<el-table-column label="操作" align="center">
				<template slot-scope="scope">
					<el-button icon="el-icon-delete" @click="handleDelete(scope.$index,scope.row)"></el-button>
				</template>
			</el-table-column>
		</el-table>
		<el-button @click="drawer = true" type="primary"  class="drawer">
		  结算
		</el-button>
		
		<el-drawer
		  title="我是标题"
		  :visible.sync="drawer"
		  :with-header="false"
		  :direction="direction">
		  <span class="el-icon-shopping-cart-full" style="font-size: 38px;">:</span>
		</el-drawer>
	</div>
</template>
<style>
.drawer{
	float: right;
	margin-right: 50px;
	margin-top: 20px;
	height:50px;
	width: 88px; 
	 border-radius: 50px 50px 50px 50px;
}
</style>

<script>
	export default {
		data() {
			return {
				tableData: [{
					name: '苹果',
					price: '5',
					number: '7'
				}, {
					name: '香蕉',
					price: '6',
					number: '8'
				},
				{
					name: '苹果',
					price: '5',
					number: '7'
				},
				{
					name: '苹果',
					price: '5',
					number: '7'
				},],
				drawer: false,
				direction:'btt',
			}
		},
		methods: {
			handleDelete(index, row) {
				console.log(index, row);
			},
			handleChange(value) {
				console.log(value);
			}
		}
	}
</script>
