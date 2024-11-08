<script setup>
</script>

<template>
  <v-container class="fluid">
    <v-layout class="align-center justify-center fill-height">
      <v-form>
        <!-- Heading -->
        <h2 class="text-h2 text-center mb-8">Extreme Caesar Cipher</h2>

        <v-row class="d-flex justify-content-center">
          <v-col cols="8">
            <v-text-field
              clearable
              label="Pattern"
              variant="outlined"
            ></v-text-field>
          </v-col>
          <v-col cols="4" class="d-flex align-items-center">
            <v-btn class="">Randomize Pattern</v-btn>
          </v-col>
        </v-row>
        <v-checkbox label="Decode"></v-checkbox>

        <!-- Text Area and Result Area Side by Side -->
        <v-row>
          <v-col cols="6">
            <v-card>
              <v-card-title>Text to encode / decode</v-card-title>
              <v-card-text>
                <v-textarea
                  clearable
                  variant="outlined"
                  no-resize
                ></v-textarea>
              </v-card-text>
            </v-card>
          </v-col>

          <v-col cols="6">
            <v-card>
              <v-card-title>Output</v-card-title>
              <v-card-text>
                <v-textarea
                  readonly
                  variant="outlined"
                  no-resize
                ></v-textarea>
              </v-card-text>
            </v-card>
          </v-col>
        </v-row>

        <!-- Bottom Button -->
        <v-col class="text-center mb-4 mt-4">
          <v-btn class="v-btn--size-x-large">GO</v-btn>
        </v-col>

      </v-form>
    </v-layout>

    <v-bottom-navigation app class="d-flex align-center">
      <!-- Icon placed on the far right -->
      <v-icon
        icon="mdi-github"
        size="30"
        class="ml-auto mr-4"
        @click="goToGitHub"
      ></v-icon>
    </v-bottom-navigation>

  </v-container>
</template>

<style scoped>
.fill-height{
  min-height: 100vh;
}
</style>

<script>
export default {
  methods: {
    goToGitHub() {
      // Open GitHub link in a new tab
      window.open('https://github.com/Cysiuu/ecc', '_blank');
    }
  }
}
</script>

