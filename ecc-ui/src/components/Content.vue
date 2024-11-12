<script setup>
import {ref} from "vue";
import axios from "axios";
import {randomizePattern} from '@/utils/patternGenerator';
import Docs from "@/components/Docs.vue";

const baseURL = import.meta.env.VITE_BASE_URL;

const cipher_text = ref("");
const pattern = ref("");
const output = ref("");

const sendData = async () => {
  try {
    const response = await axios.post(`${baseURL}/api/cipher/encrypt`, {
      textToCipher: cipher_text.value,
      pattern: pattern.value
    });
    output.value = response.data.cipheredText;
    console.log("Response received:", response.data);
  } catch (error) {
    console.error('Error sending data:', error);
  }
};

const generateRandomPattern = () => {
  pattern.value = randomizePattern(cipher_text.value);
};

const decode = () => {
  pattern.value = pattern.value.replaceAll("/", "/-");
};

</script>

<template>
  <v-container class="fluid align-center justify-center fill-height">

    <h2 class="text-h2 mb-8 text-center font-weight-bold">
      <span class="text-secondary">Extended</span> Caesar Cipher
    </h2>

    <v-row class="mx-auto">

    <Docs></Docs>

      <v-spacer></v-spacer>

      <v-col cols="12" md="7">
        <v-form>
          <v-card class="mb-4">
            <v-card-title>Text to encode / decode</v-card-title>
            <v-card-text>
              <v-textarea
                clearable
                placeholder="Write here..."
                variant="outlined"
                no-resize
                v-model="cipher_text"
              ></v-textarea>
            </v-card-text>
          </v-card>

          <v-row class="pa-2 d-flex justify-center align-center" style="margin: 0 auto;">
            <v-col cols="12" sm="8" md="8" lg="8" xl="8" class="d-flex align-center">
              <v-text-field
                clearable
                label="Pattern"
                variant="solo"
                class="mt-5 mr-5"
                v-model="pattern"
              ></v-text-field>
            </v-col>

            <v-row>
              <v-col cols="12" sm="6" md="6" lg="6" xl="6" class="d-flex align-center justify-center">
                <v-btn
                  color="secondary"
                  class="font-weight-600 custom-button"
                  rounded="lg"
                  size="large"
                  @click="generateRandomPattern"
                >
                  Randomize <br/> Pattern
                </v-btn>
              </v-col>
              <v-col cols="12" sm="6" md="6" lg="6" xl="6" class="d-flex align-center justify-center">
                <v-btn
                  color="secondary"
                  class="font-weight-600 custom-button"
                  rounded="lg"
                  size="large"
                  @click="decode"
                >
                  Decode
                </v-btn>
              </v-col>
            </v-row>
          </v-row>

          <v-card class="mt-4">
            <v-card-title>Output</v-card-title>
            <v-card-text>
              <v-textarea
                readonly
                variant="outlined"
                no-resize
                v-model="output"
              ></v-textarea>
            </v-card-text>
          </v-card>

          <v-col class="text-center mt-4">
            <v-btn
              color="secondary"
              size="x-large"
              rounded="lg"
              class="font-weight-600"
              @click="sendData"
            >
              GO
            </v-btn>
          </v-col>
        </v-form>
      </v-col>

    </v-row>
  </v-container>
</template>

<style scoped>

.fill-height {
  min-height: 100vh;
}

.font-weight-600 {
  font-weight: 600;
}

.custom-button {
  text-align: center;
  line-height: 1.2;
}

</style>

