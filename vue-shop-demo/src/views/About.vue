<template>
	<div class="about">
		<div style="margin-top: 15px;">
			<el-input placeholder="请输入内容" v-model="search">
				<el-button slot="append" icon="el-icon-search">搜索</el-button>
			</el-input>
		</div>
		<el-table :data="tableData" stripe style="width: 100%">
			<el-table-column prop="goods_id" label="订单编号" width="180" align='center'></el-table-column>
			
			<el-table-column prop="goods_name" label="商品名称" width="180" align='center'></el-table-column>

			<el-table-column prop="goods_price" label="价格" width="180" align='center'></el-table-column>

			<el-table-column prop="goods_num" label="数量" width="180" align='center'></el-table-column>

			<el-table-column label="操作" align="center">

				<template slot-scope="scope">
					<el-button icon="el-icon-edit" @click="edit(scope.row)"></el-button>
					<el-button icon="el-icon-delete" @click="del(scope.row)"></el-button>
				</template>
			</el-table-column>
		</el-table>
		<el-button @click="drawer = true" class="drawer">
			结算
		</el-button>

		<el-drawer title="我是标题" :visible.sync="drawer" :with-header="false" :direction="direction">
			<span class="el-icon-shopping-cart-full" style="font-size: 38px;">:</span>
		</el-drawer>
	</div>
</template>
<style>
	.drawer {
		float: right;
		margin-right: 50px;
		margin-top: 20px;
		height: 50px;
		width: 88px;
		border-radius: 50px 50px 50px 50px;
	}
</style>

<script>
	export default {
		data() {
			return {
				tableData: [{
					goods_name: '苹果',
					goods_price: '5',
					goods_num: '7'
				}],
				drawer: false,
				direction: 'btt',

			}
		},
		methods: {
			del(row){
			    const _this1=this;
			    this.axios.delete('http://localhost:8889/orderlist/deleteById/'+row.id).then(resp=> {
			            _this1.$alert('商品删除成功！', '消息', {
			                confirmButtonText: '确定',
			                callback: action => {
			                //   动态刷新
			                    window.location.reload()
			                }
			            });
			    })
			},
			edit(row) {
				alert(row.id)
			    this.$router.push({
			        path:'/update',
			        query:{
			            id:row.id
			        }
			    })
			    // row.id
			},
		},
		//访问后端数据
		created() {
			const _this = this
			this.$axios.get('http://localhost:8889/orderlist/findAll')
				.then(resp => {
					_this.tableData = resp.data
				})

		}
	}
</script>
