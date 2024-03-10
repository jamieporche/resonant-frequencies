import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

const router = new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
      {
        path: '/',
        name: 'home',
        component: Home,
        meta: {
          requiresAuth: true
        }
      },
      {
        path: "/login",
        name: "login",
        component: Login,
        meta: {
          requiresAuth: false
        }
      }
    ]
  })
  
  export default router;  