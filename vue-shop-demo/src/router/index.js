import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import List from '../views/List.vue'
import Update from '../views/Update.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: () => import( '../views/About.vue')
  },
  {
	path:'/list',
	name:'List',
	component: ()=>import('../views/List.vue')
  },
  {
  	path:'/update',
  	name:'Update',
  	component: ()=>import('../views/Update.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
