import { createRouter, createWebHistory } from 'vue-router'
import CipherComponent from '@/components/CipherComponent.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: CipherComponent
    },
  ]
})

export default router
