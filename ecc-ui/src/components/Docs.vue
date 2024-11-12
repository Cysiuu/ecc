<script setup>

</script>

<template>

  <v-col cols="12" md="5">
    <v-card outlined>
      <v-card-title class="text-h4 font-weight-bold">About</v-card-title>
      <v-divider thickness="3"></v-divider>

      <v-card-text>
        <div class="section">
          <p>The Extended Caesar Cipher is a modified version of the classic Caesar cipher. Unlike the traditional cipher, which uses a single shift for all letters, this extended version allows you to specify different shifts for different parts of the text. This adds an extra layer of complexity and security, making it more versatile than the original Caesar cipher.</p>
        </div>
        <v-divider thickness="3"></v-divider>
        <h5 class="text-h4 mb-4 mt-4 font-weight-bold">How to use</h5>
        <v-divider thickness="3"></v-divider>
        <div class="section">
          <h5 class="text-h5 font-weight-bold">Step 1: Enter Text</h5>
          <p>Write the text you want to encode or decode in the first text box. This is the main content that will be processed.</p>
        </div>

        <v-divider thickness="3"></v-divider>

        <div class="section">
          <h5 class="text-h5 font-weight-bold">Step 2: Specify the Pattern</h5>
          <p class="mt-2 mb-3">Define the pattern in the format <v-chip color="secondary" text-color="white" small>start:end/shift;</v-chip></p>
          <p class="mt-2 mb-3">This format specifies the range within the text that you want to shift. The <strong>start</strong> position is where the shifting begins, and the <strong>end</strong> position is where it stops. For example, <v-chip color="secondary" text-color="white" small>s:3/15</v-chip> means starting from the beginning of the text (position "s") to the 3rd character, with a shift value of 15.</p>
          <p class="mt-2 mb-3">If you want to apply the shift to a single character, use the same position for both <strong>start</strong> and <strong>end</strong>. For example, <v-chip color="secondary" text-color="white" small>1:1/23</v-chip> will shift only the first character by 23.</p>
          <p class="mt-2 mb-3">Example Pattern: <v-chip color="secondary" text-color="white" small>s:3/15;4:7/5;8:e/20</v-chip></p>

          <ul class="pl-4">
            <li><strong>start:</strong> Start position of the range (use "s" for the beginning of the text).</li>
            <li><strong>end:</strong> End position of the range (use "e" for the end of the text).</li>
            <li><strong>shift:</strong> Shift value (1-26). To decode, add a "-" before the shift value (e.g., -5).</li>
          </ul>
        </div>

        <v-divider thickness="3"></v-divider>

        <div class="section">
          <h5 class="text-h5 font-weight-bold">Optional: Randomize Pattern</h5>
          <p>Click "Randomize Pattern" to generate a random pattern based on the text length.</p>
        </div>

        <v-divider thickness="3"></v-divider>

        <div class="section">
          <h5 class="text-h5 font-weight-bold">Step 3: Encode or Decode</h5>
          <p>After entering the text and pattern, click "GO" to encode.<br> To decode, add a "-" before shift values in the pattern or click "Decode" after you input your pattern</p>
        </div>

      </v-card-text>
    </v-card>
  </v-col>
</template>

<style scoped>
.section {
  margin: 10px 0;
}

p {
  font-family: 'Lato', sans-serif;
}
</style>
