import { createApp } from 'vue';
import router from './router';
import axios from 'axios';
import 'vuetify/styles';
import { createVuetify } from 'vuetify';
import * as components from 'vuetify/components';
import * as directives from 'vuetify/directives';
import '@mdi/font/css/materialdesignicons.css';
import '@/assets/main.scss';
import App from './App.vue';

const vuetify = createVuetify({
  components,
  directives,
  theme: {
    defaultTheme: 'light', // Set the default theme to light or dark
    themes: {
      light: {
        colors: {
          primary: '#179299', // Catppuccin Latte - Teal color
          secondary: '#f88484', // Catppuccin Latte - Orange color
          background: '#ffffff', // Catppuccin Latte - Peachy background
          surface: '#ffffff', // Lighter surface color from Catppuccin
          error: '#f38ba8', // Catppuccin Latte - Red color
          info: '#04a5e5', // Catppuccin Latte - Blue color
          success: '#40a02b', // Catppuccin Latte - Green color
          warning: '#e5c890', // Catppuccin Latte - Soft Yellow
          card: '#f4dbd6', // Lighter pinkish card color
        },
      },
      dark: {
        colors: {
          primary: '#89b4fa', // Catppuccin Mocha - Blue color
          secondary: '#f5c2e7', // Catppuccin Mocha - Pink color
          background: '#1e1e2e', // Dark purple background for the dark theme
          surface: '#302d41', // A darker purple for card surfaces
          error: '#f38ba8', // Catppuccin Mocha - Soft red color
          info: '#89dceb', // Catppuccin Mocha - Cyan color
          success: '#a6e3a1', // Catppuccin Mocha - Light green
          warning: '#fab387', // Catppuccin Mocha - Orange
          card: '#1e1e2e', // Same as background but could add transparency for effect
        },
      },
    },
  },
  typography: {
    defaultFontFamily: 'Lato, sans-serif', // Set Lato as the default font family
  },
});

const app = createApp(App);
app.config.globalProperties.$axios = axios;
app.use(vuetify);
app.use(router);
app.mount('#app');
