import { createApp } from 'vue';

import router from './router';
import axios from 'axios';
import 'vuetify/styles'
import { createVuetify } from 'vuetify'
import * as components from 'vuetify/components'
import * as directives from 'vuetify/directives'
import '@mdi/font/css/materialdesignicons.css'

import App from './App.vue'

import 'vuetify/styles';

const vuetify = createVuetify({
  components,
  directives,
})
  const app = createApp(App)
  app.config.globalProperties.$axios = axios;
  app.use(vuetify)
  app.use(router)
  app.mount('#app')




