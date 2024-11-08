<script setup>
function goToGitHub() {
  window.open('https://github.com/Cysiuu/ecc', '_blank');
}
</script>
<template>
  <v-bottom-navigation app class="d-flex align-center">
    <v-icon
      icon="mdi-github"
      size="30"
      class="ml-auto mr-4"
      @click="goToGitHub"
    ></v-icon>
  </v-bottom-navigation>
</template>

<style scoped>

</style>
