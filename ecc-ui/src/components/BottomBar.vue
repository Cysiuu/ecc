<script setup>
import { useTheme } from 'vuetify';
const theme = useTheme();

function toggleTheme() {
  theme.global.name.value = theme.global.current.value.dark ? 'light' : 'dark';
}

function goToGitHub() {
  window.open('https://github.com/Cysiuu/ecc', '_blank');
}
</script>

<template>
  <v-bottom-navigation class="d-flex justify-center align-center">
    <v-row
      class="d-flex align-center justify-center"
      style=""
    >
    <v-icon
      icon="mdi-github"
      size="30"
      class="icon-spacing"
      @click="goToGitHub"
    ></v-icon>
    <v-icon
      icon="mdi-moon-waning-crescent"
      size="30"
      class="icon-spacing"
      @click="toggleTheme"
    ></v-icon>
    </v-row>
  </v-bottom-navigation>
</template>

<style scoped>
.icon-spacing {
  margin: 0 8px; /* Adjust margin between icons */
}
</style>
