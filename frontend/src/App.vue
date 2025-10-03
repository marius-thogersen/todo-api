<script setup>
import TodoBoard from "./components/TodoBoard.vue";
import Toolbar from "./components/Toolbar.vue";
</script>

<template>
  <Toolbar class="toolbar" />
  <TodoBoard />
</template>

<style scoped>
.toolbar {
  min-width: 200px;
  height: 100dvh;
  background: transparent;
  border: 2px solid;
  color: red;
  box-sizing: border-box;
}

.red {
  color: red;
}
</style>
