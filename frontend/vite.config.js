import { defineConfig } from "vite";
import vue from "@vitejs/plugin-vue";

// https://vite.dev/config/
export default defineConfig({
  plugins: [vue()],
  server: {
    host: true, // important: listen on 0.0.0.0 so Nginx can reach it
    port: 5173,
    strictPort: true,
  },
});
