import { createApp } from 'vue';
import router from './router';
import axios from 'axios';
import 'vuetify/styles'; // Import Vuetify styles
import { createVuetify } from 'vuetify';
import * as components from 'vuetify/components';
import * as directives from 'vuetify/directives';
import '@mdi/font/css/materialdesignicons.css';
import '@/assets/base.sass';
import App from './App.vue';

const vuetify = createVuetify({
  components,
  directives,
  theme: {
    defaultTheme: 'light',
    themes: {
      light: {
        colors: {
          primary: '#179299',
          secondary: '#ef6666',
          background: '#ffffff',
          surface: '#ffffff',
          error: '#f38ba8',
          info: '#04a5e5',
          success: '#40a02b',
          warning: '#e5c890',
          card: '#f4dbd6',
        },
      },
      dark: {
        colors: {
          primary: '#89b4fa',
          secondary: '#ef6666',
          background: '#232325',
          surface: '#37373a',
          error: '#f38ba8',
          info: '#89dceb',
          success: '#a6e3a1',
          warning: '#fab387',
          card: '#1e1e2e',
        },
      },
    },
  },
});

const app = createApp(App);
app.config.globalProperties.$axios = axios;
app.use(vuetify);
app.use(router);
app.mount('#app');
